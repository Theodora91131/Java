'use strict';

//引用操作資料庫的物件
const sql = require('./asyncDB');

//------------------------------------------
//執行資料庫動作的函式-取出單一商品
//------------------------------------------
var query = async function(ordate){
    var result={};
   
    await sql('select a.odno, a.prono, b.proname, b.price, a.amt, a.ordate = $1 from detail a, stock b where a.prono = b.prono ',[ordate])
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
module.exports = {query};