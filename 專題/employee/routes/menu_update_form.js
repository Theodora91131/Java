var express = require('express');
var router = express.Router();

//增加引用函式
const menu = require('./utility/menu');

//接收GET請求
router.get('/', function(req, res, next) {
    var no = req.query.prono;

    menu.query(no).then(d => {
        if (d!=null && d!=-1){
            var data = {
                prono: d.prono,
                proname: d.proname,
                stockamt: d.stockamt,
                empno: d.empno,
                price: d.price,
            }

            res.render('menu_update_form', {item:data});  //將資料傳給更新頁面
        }else{
            res.render('notFound');  //導向找不到頁面
        }  
    })
});

//匯出
module.exports = router;