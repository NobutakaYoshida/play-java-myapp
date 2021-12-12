package controllers;

import play.mvc.*;
/** ---Resultクラスを使う際、追加でインポート--- */
import akka.util.*;
import java.util.*;
import play.http.*;

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
     * Ok関数内で指定したデフォルトのメッセージを表示
     */
//    public Result index() {
//        return ok("Welcome to play Framework!");
//    }


    /**
     * 「TODO」ダミーページを表示
     * 「とりあえずアクションメソッドを一通り用意しておいて、具体的な内容は後で作成する」
     * という時に使う開発時の便利機能
     */
//    public Result index() {
//        return TODO;
//    }


    /**
     * Resultインスタンスの作成（クライアントに情報を返送するレスポンスを扱うクラス）
     * 〇Result(《ResponseHeader》,《HttpEntity》);
     *
     * 【第１引数】ResultHeaderクラス（レスポンスのステータス情報やヘッダー情報を送信するクラス）
     * 〇new ResponseHeader( 整数 , 《Map》 )
     *   ・（第１引数）整数　＝　ステータス番号
     *   ・（第２引数）Map　＝　必要なヘッダー情報をまとめたもの（【scala】: scala.predef.Map　【Java】:java.util.Map(=HashMap))
     *
     * 【第２引数】HttpEntityクラス（HTTPレスポンスのボディ部分を管理するクラス）
     * 〇new HttpEntity.Strict(《ByteString》, 《Optional》)
     *  ※いくつかあるHttpEntityのサブクラスの中でもっとも一般的に用いられるクラス
     *   ・（第１引数）ByteString　＝　実際にコンテンツとして出力されるテキスト
     *   ・（第２引数）Optional　＝　テキストの値を指定
     */
//    public Result index() {
//        return new Result(
//                new ResponsiHeader(200, new HashMap<>),
//                new HttpEntity.Strict(
//                        ByteString.fromString("This is sample text."),
//                        Optional.ofNullable("text/plain")
//                )
//        );
//    }


    /**
     * Ok関数の中身でhtmlタグを指定し、内容を出力
     * .as以降で出力形式をしていしている
     */
    public Result index() {
        return ok("<h1>Hello!</h1><p>This is sample message.<p>")
                .as("text/html");
    }


}
