'use strict';

//引用操作資料庫的物件
const sql = require('./asyncDB');

//------------------------------------------
//執行資料庫動作的函式-傳回所有產品資料
//------------------------------------------
var list = async function(){
    var result=[];
	
    await sql('select a.odno, a.prono, b.proname, a.amt, a.ordate from detail a, stock b where a.prono = b.prono order by a.odno ')
        .then((data) => {            
            result = data.rows;  
        }, (error) => {
            result = null;
        });
		
    return result;
}

//------------------------------------------
//執行資料庫動作的函式-取出單一商品
//------------------------------------------
var one = async function(odno){
    var result={};
    
    await sql('SELECT * FROM detail WHERE odno = $1', [odno])
        .then((data) => {
            if(data.rows.length > 0){
                result = data.rows;   
            }else{
                result = -1;
            }    
        }, (error) => {
            result = null;
        });
		
    return result;
}
//------------------------------------------
//執行資料庫動作的函式-取出單一商品
//------------------------------------------
var query = async function(ordate){
    var result={};
   
    await sql('select a.odno, a.prono, b.proname, b.price, a.amt, a.ordate from detail a, stock b where a.prono = b.prono and a.ordate = $1  order by a.odno', [ordate])
        .then((data) => {
            if(data.rows.length > 0){
                console.log(data.rows.length);
                result = data.rows;   
            }else{
                result = -1;
                console.log("not found");
            }    
        }, (error) => {
            result = null;
        });
		
    return result;
}






//匯出
module.exports = {list, one, query};