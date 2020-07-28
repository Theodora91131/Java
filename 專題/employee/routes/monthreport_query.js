var express = require('express');
var router = express.Router();

//增加引用函式
var moment = require('moment');

const product = require('./utility/month');

//接收GET請求
router.get('/', function(req, res, next) {
    var ordate = req.query.ordate;   //取出參數
    product.query(ordate).then(data => {
        if (data==null){
            res.render('error');  //導向錯誤頁面
        }else if(data==-1){
            res.render('notFound');  //導向找不到頁面                
        }else{
            data.ordate=moment(data.ordate).format("YYYY-MM-DD")
            res.render('monthreport_query', {item:data});  //將資料傳給顯示頁面
        }  
    })
});

module.exports = router;