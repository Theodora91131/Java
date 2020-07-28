var express = require('express');
var router = express.Router();

//增加引用函式
const menu = require('./utility/menu');

//接收POST請求
router.post('/', function(req, res, next) {
    var prono = req.body.prono;  
    var stockamt = req.body.stockamt;      
    var empno = req.body.empno;          
    var proname = req.body.proname; 
    var price = req.body.price; 
    //取得產品名稱

    // 建立一個新資料物件
    var newData={
        prono:prono,
        stockamt:stockamt,
        empno:empno,
        proname:proname,
        price:price,
    } 
    
    menu.add(newData).then(d => {
        if (d==0){
            res.render('addSuccess');  //傳至成功頁面
        }else{
            res.render('addFail');     //導向錯誤頁面
        }  
    })
});

module.exports = router;