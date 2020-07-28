'use strict';

//引用操作資料庫的物件
const sql = require('./asyncDB');

//------------------------------------------
// 取出型態資料
//------------------------------------------
var getDropdownData = async function(){
    //儲存下拉式選單資料
    var protype;
    
    //取回protype資料
    await sql('SELECT * FROM protype ORDER BY typno')
        .then((data) => {
            protype = data.rows;  
        }, (error) => {
            result = [];
        });
    
    //設定回傳資料    
    var result = {};
    result.protype = protype;

    //回傳
    return result;
}

//------------------------------------------
// 新增商品
//------------------------------------------
var add = async function(newData){
    var result;

    await sql('INSERT INTO product (prono, proname, typno, price, picture) VALUES ($1, $2, $3, $4, $5)', [newData.prono, newData.proname, newData.typno, newData.price, newData.picture])
        .then((data) => {
            result = 0;  
        }, (error) => {
            result = -1;
        });
		
    return result;
}
//------------------------------------------
//執行資料庫動作的函式-取出單一商品
//------------------------------------------
var query = async function(prono){
    var result={};
    
    await sql('SELECT * FROM product WHERE prono = $1', [prono])
        .then((data) => {
            if(data.rows.length > 0){
                result = data.rows[0];   
            }else{
                result = -1;
            }    
        }, (error) => {
            result = null;
        });
		
    return result;
}

//----------------------------------
// 更新商品
//----------------------------------
var update = async function(newData){
    var results;

    await sql('UPDATE product SET proname=$1, price=$2, inventorydate=$3 WHERE prono = $4', [newData.proname, newData.price, newData.inventorydate, newData.prono])
        .then((data) => {
            results = data.rowCount;  
        }, (error) => {
            results = -1;
        });
		
    return results;
}

//匯出
module.exports = {getDropdownData, add ,query, update};