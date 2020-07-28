'use strict';

//引用操作資料庫的物件
const sql = require('./asyncDB');

//----------------------------------
// 刪除商品
//----------------------------------
var remove = async function(cusno){
    var result;

    await sql('DELETE FROM customer WHERE cusno = $1', [cusno])
        .then((data) => {
            result = data.rowCount;  
        }, (error) => {
            result = -1;
        });
		
    return result;
}

//匯出
module.exports = {remove};