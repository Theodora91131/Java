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
var menu_query_form = require('./routes/menu_query_form');
var menu_query = require('./routes/menu_query');
var menu_add_form = require('./routes/menu_add_form');
var menu_add = require('./routes/menu_add');
var menu_remove_form = require('./routes/menu_remove_form');
var menu_remove = require('./routes/menu_remove');
var menu_update_no = require('./routes/menu_update_no');
var menu_update_form = require('./routes/menu_update_form');
var menu_update = require('./routes/menu_update');
var detail_list = require('./routes/detail_list');
var detail_one = require('./routes/detail_one');
var detail_query_form = require('./routes/detail_query_form');
var detail_query = require('./routes/detail_query');
var monthreport_query_form = require('./routes/monthreport_query_form');
var monthreport_query = require('./routes/monthreport_query');
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
app.use('/menu/query/form', menu_query_form);
app.use('/menu/query', menu_query);
app.use('/menu/add/form', menu_add_form);
app.use('/menu/add', menu_add);
app.use('/menu/remove/form', menu_remove_form);
app.use('/menu/remove', menu_remove);
app.use('/menu/update/no', menu_update_no);
app.use('/menu/update/form', menu_update_form);
app.use('/menu/update', menu_update);
app.use('/detail/list', detail_list);
app.use('/detail/one', detail_one);
app.use('/detail/query/form', detail_query_form);
app.use('/detail/query', detail_query);
app.use('/monthreport/query/form',monthreport_query_form);
app.use('/monthreport/query',monthreport_query);
//-----------------------------------------
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
