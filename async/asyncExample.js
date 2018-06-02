/**
 * Created by raytine on 2018/6/2.
 */
/*
*             同步和异步的区别
* 同步，是所有的操作都做完，才返回给用户结果。
* 异步，不用等所有操作等做完，就相应用户请求。
**/
/*
*             js 异步编程有4种做法
* 1.回调函数。后者等待前者的执行结果
* 2.事件监听。任务的执行不取决于代码的顺序，而取决于某个事件是否发生
* 3.发布/订阅。
* 4.promises对象。每一个异步任务返回一个Promise对象，该对象有一个then方法，允许指定回调函数
*/

//1.回调函数
function example(callback) {
    setTimeout(function () {
        callback();//callback()是example()的回调函数
    },2000);
}

function a() {
    console.log("I am function a!");
}

example(a());//执行2秒后输出 I am function a!


//2.事件监听
function example2() {
    setTimeout(function () {
        example2.trigger('done');//当example2发生done事件，就执行a
    },2000);
}