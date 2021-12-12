package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
//    public Result index() {
//        return ok(views.html.index.render());
//    }


    /**
     * ok関数内の出力文字をデフォルトメッセージに変更
     */
//    public Result index() {
//        return ok("Welcome to play Framework!");
//    }


    /**
     * TODOダミーページの出力
     */
    public Result index() {
        return TODO;
    }
}
