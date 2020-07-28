var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usersRouter = require('./routes/users');
var cart = require('./routes/cart');
var product_list = require('./routes/product_list');
var rice = require('./routes/rice');
var dessert = require('./routes/dessert');
var drink = require('./routes/drink');
var noodle = require('./routes/noodle');
var dish = require('./routes/dish');
var soup = require('./routes/soup');
var login = require('./routes/login');
var user_login = require('./routes/user_login');
var user_logout = require('./routes/user_logout');
var user_show = require('./routes/user_show');

var app = express();


//--------------------------------------------------------------------
// 增加引用express-session
//--------------------------------------------------------------------
var session = require('express-session');
app.use(session({secret: '請更改成一個隨機字串用來加密產生的signedCookie', cookie: { maxAge: 60000 }}));
//--------------------------------------------------------------------

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
app.use('/product/list', product_list);
app.use('/rice', rice);
app.use('/dessert', dessert);
app.use('/drink', drink);
app.use('/noodle', noodle);
app.use('/dish', dish);
app.use('/soup', soup);
app.use('/cart', cart);
app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/login', login);
app.use('/user/login', user_login);
app.use('/user/logout', user_logout);
app.use('/user/show', user_show);

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
