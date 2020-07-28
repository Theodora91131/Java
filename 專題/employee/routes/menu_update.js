var express = require('express');
var router = express.Router();

//增加引用函式
const menu = require('./utility/menu');

//接收POST請求
router.post('/', function(req, res, next) {
    var prono = req.body.prono;   //取得產品編號

    var newData={
        prono:prono,                   //產品編號
        proname: req.body.proname,     //取得產品名稱
        stockamt:req.body.stockamt,
        empno:req.body.empno,
        price: Number(req.body.price), //取得價格
    } 
    
    menu.update(newData).then(d => {
        if (d>=0){
            res.render('updateSuccess', {results:d});  //傳至成功頁面
        }else{
            res.render('updateFail');     //導向錯誤頁面
        }  
    })
});

//匯出
module.exports = router;