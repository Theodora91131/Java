var express = require('express');
var router = express.Router();

//增加引用函式
const employee = require('./utility/employee');

//接收POST請求
router.post('/', function(req, res, next) {
    var empno = req.body.empno ;   //取得產品編號
   
    employee.remove(empno).then(d => {
        if(d>=0){
            res.render('removeSuccess', {results:d});  //傳至成功頁面     
        }else{
            res.render('removeFail');     //導向錯誤頁面
        }
    })    
});

module.exports = router;