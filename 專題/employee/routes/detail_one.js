var express = require('express');
var router = express.Router();

//增加引用函式
const detail = require('./utility/detail');

//接收GET請求
router.get('/:odno', function(req, res, next) {
    var odno = req.params.odno;   //取出參數

    detail.one(odno).then(data => {
        if (data==null){
            res.render('error');  //導向錯誤頁面
        }else if(data==-1){
            res.render('notFound');  //導向找不到頁面                
        }else{
            res.render('detail_one', {item:data});  //將資料傳給顯示頁面
        }  
    })
});

module.exports = router;