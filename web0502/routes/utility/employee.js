'use strict';

//引用操作資料庫的物件
const sql = require('./asyncDB');

//------------------------------------------
//執行資料庫動作的函式-新增產品資料
//------------------------------------------
var add = async function(newData){
    var result;
   // console.log(newData.empno);
    //console.log(newData.empname);
    //console.log(newData.title);
    //console.log(newData.address);
    await sql('INSERT INTO employee (empno, empname,title, address) VALUES ($1, $2, $3, $4)', [newData.empno, newData.empname,newData.title ,newData.address])
        .then((data) => {
            result = 0;  
        }, (error) => {
            result = -1;
        });
		
    return result;
}

//匯出
module.exports = {add};