package view

class Interface {
    Scanner scanner = new Scanner(System.in)

    void cliMenu() {
        while (true) {
            try {
                println("+================================================+")
                println("|                   Linketinder                  |")
                println("+================================================+")
                println("[1] - Adicionar empresa")
                println("[2] - Adicionar candidato")
                println("[3] - Listar empresas")
                println("[4] - Listar candidatos")
                println("[0] - Encerrar programa")
                println("+================================================+")
                print("\nSelecione uma opção:")
                println("+================================================+")

                def optionMenu = scanner.nextInt()
                scanner.nextLine()

                if (optionMenu == 1) {
                    cliAddTask()
                } else if (optionMenu == 2) {
                    cliListTasks()
                } else if (optionMenu == 3) {
                    println("+================================================+")
                    println("Editar ainda não funciona...")
                    println("+================================================+")
                    println("Aperte \"Enter\" para continuar")
                    scanner.nextLine()
                } else if (optionMenu == 4) {
                    cliDeleteTask()
                } else if (optionMenu == 5) {
                    println("+================================================+")
                    println("Quantidade por status ainda não funciona...")
                    println("+================================================+")
                    println("Aperte \"Enter\" para continuar")
                    scanner.nextLine()
                } else if (optionMenu == 6) {
                    println("+================================================+")
                    println("Filtro por data ainda não funciona...")
                    println("+================================================+")
                    println("Aperte \"Enter\" para continuar")
                    scanner.nextLine()
                } else if (optionMenu == 0) {
                    scanner.close()
                    break
                } else {
                    println("+================================================+")
                    println("Erro: Insira uma opção válida")
                    println("+================================================+")
                    println("Aperte \"Enter\" para continuar")
                    scanner.nextLine()
                }
            } catch (Exception e) {
                println("+================================================+")
                println("Erro: Adicione a entrada correta (números de 0 - 6)")
                println("+================================================+")
                println("Aperte \"Enter\" para continuar")
                scanner.nextLine()
            }
        }
    }
}