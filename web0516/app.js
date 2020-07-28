var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
//------------------------------------------------------------
// 增加引用模組
//------------------------------------------------------------
var product_add_form = require('./routes/product_add_form');
var product_add = require('./routes/product_add');
//------------------------------------------------------------
//------------------------------------------------------------
// 增加引用模組
//------------------------------------------------------------
var customer_update_no = require('./routes/customer_update_no');
var customer_update_form = require('./routes/customer_update_form');
var customer_update = require('./routes/customer_update');
//------------------------------------------------------------
//------------------------------------------------------------
// 增加引用模組
//------------------------------------------------------------
var product_update_no = require('./routes/product_update_no');
var product_update_form = require('./routes/product_update_form');
var product_update = require('./routes/product_update');
//------------------------------------------------------------
var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);
app.use('/users', usersRouter);
//-----------------------------------------
// 設定模組使用方式
//-----------------------------------------
app.use('/product/add/form', product_add_form);
app.use('/product/add', product_add);
//-----------------------------------------
//-----------------------------------------
// 設定模組使用方式
//-----------------------------------------
app.use('/customer/update/no', customer_update_no);
app.use('/customer/update/form', customer_update_form);
app.use('/customer/update', customer_update);
//-----------------------------------------
//-----------------------------------------
// 設定模組使用方式
//-----------------------------------------
app.use('/product/update/no', product_update_no);
app.use('/product/update/form', product_update_form);
app.use('/product/update', product_update);
//-----------------------------------------
//----------------------------------------
// 可由外部直接取用資料夾
//----------------------------------------
app.use(express.static('public/picture'));
//----------------------------------------
// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;
