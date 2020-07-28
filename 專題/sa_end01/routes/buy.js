var express = require('express');
var router = express.Router();

//接收GET請求
router.get('/', function(req, res, next) {
    var prono = req.session.prono;
    var proname = req.session.proname;
    var price = req.session.price;
    var newData={        
        prono:prono,
        proname:proname,
        price:price
    }
    

    res.render('cart', {  proname:proname, price: price });
});

module.exports = router;