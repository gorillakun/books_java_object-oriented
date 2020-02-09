package test;

public class クラス {
    int value = 123;	//フィールド

    public void メソッド() {
        int value = 456;	//ローカル変数
        System.out.println(value);
        System.out.println(this.value);
    }
}