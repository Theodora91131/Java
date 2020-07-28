var express = require('express');
var router = express.Router();

//增加引用函式
const menu = require('./utility/menu');

//接收GET請求
router.get('/', function(req, res, next) {
    var prono = req.query.prono;   //取出參數

    menu.query(prono).then(data => {
        if (data==null){
            res.render('error');  //導向錯誤頁面
        }else if(data==-1){
            res.render('notFound');  //導向找不到頁面                
        }else{
            res.render('menu_query', {item:data});  //將資料傳給顯示頁面
        }  
    })
});

module.exports = router;