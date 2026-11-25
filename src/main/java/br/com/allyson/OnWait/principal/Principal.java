package br.com.allyson.OnWait.principal;

import java.util.Scanner;

public class Principal {
    private Scanner scanner = new Scanner(System.in);

    public void exibeMenu(){
        System.out.println("""
                Hello! Please, select the support that most fits you.
                1 - Business | Credit, open accounts, etc
                2 - Transactions | Financing, bank slip, etc
                """);
        int type = scanner.nextInt();

        System.out.println("""
                Please, select your preference group.
                1 - Not in a group
                2 - Aged (60+) or disabled
                3 - Elderly (80+)
                """);
        int preferencial = scanner.nextInt();
    }
}
