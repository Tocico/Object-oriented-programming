package lektion2;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-22
 * Time: 16:13
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


// インターフェース
interface InterfaceSample {
    static int Val1 = 0; // 暗黙的にfinal 定数扱い
    default void print(){};
}

// 親クラス
abstract class ClassExtends {
    protected static int val2 = 0; // static変数(クラス変数)
    abstract void setVal2(int val2);

}

// 継承クラス
class ClassSample extends ClassExtends implements InterfaceSample{
    // コンストラクタ　クラスがインスタンス化される度に変数に1加算する
    public ClassSample(int val2) {
        ClassExtends.val2 += val2;
    }

    // 変数の値を表示
    public void print(){
        System.out.println("Val1 = " + Val1 + ", val2 = " + val2);
    }

    // val2のsetterメソッド
    public void setVal2(int val2){
        System.out.println(ClassExtends.val2);
        System.out.println(ClassSample.val2);
        System.out.println(this.val2);
        ClassSample.val2 = val2;
    }
}

public class Test{

    public static void main(String[] args) {

        ClassSample cs1 = new ClassSample(1);
        cs1.print();
        ClassSample cs2 = new ClassSample(1);
        cs2.print();
        ClassSample cs3 = new ClassSample(1);
        cs3.print();

        ClassSample cs4 = new ClassSample(1);
        cs4.setVal2(0); //　代入初期化
        cs3.print();
    }

}
