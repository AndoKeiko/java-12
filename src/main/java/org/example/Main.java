package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    //Java命名規則
    //日本語、英語、アンダーバーとか色々な文字列が使える
    //先頭文字には数字使えない
    //文字数制限ない
    //大文字と小文字は区別される

    //Pascal
    //先頭大文字。一般的な英語の書き方と一緒
    //Main,Greeting

    //Camel
    //先頭は小文字。言葉の区切りから大文字
    //メソッド名や変数名に使われることが多い
    //sayHello
    //numberSecond

    //フィールド名、変数名
    //名詞
    //number, message, name, ssList

    //メソッド名
    //動詞
    //say, greet, print, printMessage
    //getXXX, setXXX, countXXX

    //定数
    //フィールドとの違いは固定値であること。絶対に変更しないこと。
    //全て大文字。Snakeケース使う場合もある
    //FULL_NAME

    //真偽値, booleanを使う時の名前
    //isXXX, hasXXX
    //isNumber, hasName

    //命名の仕方
    //適当な名前をつけないこと。誰かに使われることを想定する。
    //誰にも絶対に使われない。誰にも見せない。そういったものであれば適当でいい。
    //長くなってもいい。名前はコンパクトが一番。短く正確に伝わるものが理想。
    //これは難易度が高い。なので長くていい。正確であることが大事。短くするのは後。
    //a, b, c。こういう適当な名前はなるべく付けない。正確に

    //学習方法
    //１つ１つ理解しながら進めるorなんとなく理解した状態で次にどんどん進む
    //モチベーションの上げ方
    //前提としてモチベーションに頼らない
    //ご褒美を上げる。罰ゲーム。自分のさじ加減を他人にゆだねる。他人の目が入るだけでぜんぜん違う。
    //仕事の延長で学習する

    //課題
    //図書管理システムを作る
    //書籍（Book）を管理する情報（タイトル、著者、番号）をもつオブジェクト（クラス）を作って、そこに情報を格納
    //図書館（Library）クラスみたいなものを作って、そこにBookをListで持つようなものを保持
    //mainメソッドからこのLibraryクラスに対して検索ができるようにする。Libraryクラスは書籍検索の機能を持つ。
    //タイトル検索、著者検索、番号検索メソッドをLibraryに持たせる
    //それをmainメソッドから実行して、実行結果をコンソールに出力する

    Library library = new Library();
    library.addBooks(new Book("コレットは死ぬことにした1", "幸村アルト", 1));
    library.addBooks(new Book("赤髪の白雪姫", "あきづき空太", 2));
    library.addBooks(new Book("ハリーポッター", "幸村アルト", 3));
    library.addBooks(new Book("コレットは死ぬことにした1", "幸村アルト", 4));

    System.out.println("タイトルで検索: 'ハリーポッター'");
    List<Book> titleResults = library.searchByTitle("ハリーポッター");
    for (Book book : titleResults) {
      System.out.println(book);
    }

    System.out.println("\n作者で検索　：　’ローリング’");
    List<Book> authorResults = library.searchByAuthor("ローリング");
    for (Book book : authorResults) {
      System.out.println(book);
    }

    System.out.println("\n番号で検索: 3");
    Book numberResult = (Book) library.searchByNumber(3);
    if (numberResult != null) {
      System.out.println(numberResult);
    } else {
      System.out.println("該当する書籍が見つかりません");
    }
  }
}