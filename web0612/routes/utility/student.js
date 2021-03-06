'use strict';

//引用操作資料庫的物件
const sql = require('./asyncDB');

//------------------------------------------
//執行資料庫動作的函式-新增產品資料
//------------------------------------------
var add = async function(newData){
    var result;

    console.log(newData);
    
    await sql('INSERT INTO student (stuno, name, division, department, birthday, intern) VALUES ($1, $2, $3, $4, $5, $6)', [newData.stuno, newData.name, newData.division, newData.department, newData.birthday, newData.intern])
        .then((data) => {
            result = 0;  
        }, (error) => {
            result = -1;
        });
		
    return result;
}

//匯出
module.exports = {add};