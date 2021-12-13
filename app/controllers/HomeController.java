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
//                new ResponseHeader(200, new HashMap<>),
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
//    public Result index() {
//        return ok("<h1>Hello!</h1><p>This is sample message.<p>")
//                .as("text/html");
//    }


    /**
     * 上記をxml形式で出力
     * ※Chromeではスタイルと関連付けられていないというメッセージが表示される
     */
//    public Result index() {
//        return ok("<root><title>Hello!</title><message>This is sample message.</message></root>")
//                .as("application/xml");
//    }


    /**
     * 上記をjson形式で出力
     */
//    public Result index() {
//        return ok("{title:'Hello!', message:'This is sample message.'}")
//                .as("application/json");
//    }


    /**
     * HTMLのソースコードにヘッダー情報を設定する方法
     * 〇Http.Responseの取得
     * 　変数　＝　《Controller》.response();
     *  　・ヘッダー情報はレスポンスを管理する「Http.Response」クラスにメソッドが用意されている
     *  　・まずHttp.Responseを取得し、それからヘッダー設定のメソッドを呼び出すことになる
     *  　・Controllerクラスに用意されている「response」というメソッドで取得できる
     *
     * 〇ヘッダー情報の設定
     * 　《Http.Response》.setHeader( ヘッダー項目 , 値　);
     * 　　・ヘッダー情報の設定は、setHeaderで設定する
     *  　・第１引数にはヘッダー項目を指定する。これはControllerクラスに用意されている値を使用する
     *  　・setHeaderで一通りヘッダーの設定をした後、okでResultをreturnすれば、ヘッダーが設定された形でクライアントに表示が送られる
     */
//    public Result index() {
//        response().setHeader(ACCEPT_CHARSET, "utf-8");
//        response().setHeader(ACCEPT_LANGUAGE, "ja-JP");
//        return ok("<title>Hello!</title><h1>Hello!</h1><p>サンプルのメッセージ。</p>")
//                .as("text/html");
//    }


    /**
     * Int型のidをパラメーターから受け取り、値をセットして出力
     *
     * @param id
     * @return
     */
//    public Result index(int id) {
//        return ok("<title>Hello!</title><h1>Hello!</h1><p>ID = " + id + " です。</p>")
//                .as("text/html");
//    }


    /**
     * Int型のid、String型のnameをパラメーターから受け取り、値をセットして出力
     * ２つのパラメーターを渡す場合の記述形式は、今回は「/:id+:name」としているが、
     * 「/:id/:name」でも、「/:id=:name」でも問題ない。
     * （１つ１つの値が区別され、かつURLで利用可能な文字で記述されていれば良い。）
     *
     * @param id　【指定必須】
     * @param name　【指定必須】
     * @return
     */
//    public Result index(int id, String name) {
//        return ok("<title>Hello!</title><h1>Hello!</h1><p>ID = " + id + ", NAME = " + name + " です。</p>")
//                .as("text/html");
//    }


    /**
     * 上記と同じ処理。ただし、 nameにオプションパラメーターを使用。（未指定でもエラーにならない）
     * nameがnullの場合はorElse()メソッド内で指定した文字を出力。
     * 記述する場合はidを指定した後に「?name=○○」と書く
     *
     * @param id　【指定必須】
     * @param name　【任意】
     * @return
     */
//    public Result index(int id, Optional name) {
//        return ok("<title>Hello!</title><h1>Hello!</h1><p>ID = " + id + ", NAME = " + name.orElse("no-name") + " です。</p>")
//                .as("text/html");
//    }


    /**
     * パラメーターで渡されたnameをクッキーに保存する。（最近はセッションが使われることが多い）
     *
     * 【Cookieインスタンス作成】
     * 変数　＝　Http.Cookie.builder(　キー　,　値　).build();
     * 　※　Javaのクッキーは、Cookieクラスとして用意されている。
     * 　※　ただし、これはHttpクラスの内部クラスとして作成されているため、通常はHttp.Cookieという形で利用することになる。
     * 　※　Cookieインスタンスは、newで作成せず、Cookieに用意されているbuilderメソッドを使う。
     * 　※　これは引数にキーと値を指定して呼び出す。
     * 　※　クッキーを作成するCookieBuilderクラスのインスタンスを作成し、このクラスの「build」メソッドを呼び出すことで、Cookieインスタンスが生成される。
     *
     * 【クッキーの保存期間の設定】
     * 《CookieBuilder》.withMaxAge(Duration.ofSeconds( 秒数　))
     * 　※　作成されたクッキーはブラウザ終了時に廃棄されるため、期間を指定してクッキーを作成したい場合は、CookieBuilderの「withMaxAge」メソッドを呼び出す。
     * 　※　これは引数に保存する期間を示す値を用意する。通常は、Duration.ofSecondsメソッドを使い、これは引数に指定した秒数を表すIntegerを返す。
     *
     * Http.Cookie.builder( キー　,　値　)
     *      .withMaxAge(Duration.ofSeconds( 秒数 ))
     *      .build();
     * 　※　withMaxAgeは、CookieBuilderインスタンス自信を戻り値として返す。したがって、builderの後に呼び出し、そのままメソッドチェーンを使ってbuildすることができる。
     *
     * 【保存】
     * 《Result》.setCookie(《Cookie》);
     *
     * 【取得】
     *  変数 = 《Request》.cookie(キー);
     *
     * 【削除】
     * 《Result》.discardCookie(キー);
     *
     *
     * @param name
     * @return
     */
//    public Result index(Optional<String> name) {
//        String param = name.orElse("");
//        String message = "<p>nameはありません。</p>";
//        if(param != "") {
//            message = "<p>nameが送られました。</p>";
//            Http.Cookie newcookie = Http.Cookie.builder("name", param)
//                    .build();
//            response().setCookie(newcookie);
//        }
//        Http.Cookie cookie = request().cookie("name");
//        if(cookie == null) {
//            message += "<p>cookie: no-cookie.</p>";
//        } else {
//            message += "<p>cookie: " + cookie.value() + "</p>";
//        }
//        return ok("<title>Hello!</title><h1>Hello!</h1>" + message)
//                .as("text/html");
//    }



}
