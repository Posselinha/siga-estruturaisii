## Sua tarefa

Siga as etapas da ficha de atividade prática:

1. **Fazer a conta.** Registre neste README quantas subclasses de relatório existem hoje e quantas seriam necessárias se a secretaria pedisse uma quarta característica (um rodapé com a data de emissão). Mostre o raciocínio de 2ⁿ.
2. **Criar os decoradores.** Escreva a classe abstrata `DecoradorRelatorio`, que implementa `Relatorio` e contém um `Relatorio`, e as três subclasses `ComCabecalho`, `ComNumeracao` e `ComMarcaDagua`. Cada uma deve conter o seu comportamento **uma vez só**. Ao terminar, as quatro classes `RelatorioCom...` originais podem ser apagadas.
3. **Empilhar.** No `Main`, monte pelo menos **duas pilhas diferentes** de decoradores sobre o mesmo `RelatorioDeAlunos` e imprima as duas saídas. Experimente inverter a ordem de `ComCabecalho` e `ComNumeracao` e observe o que muda.
4. **Criar o Composite.** Escreva a interface `ItemCurricular` com `getNome()`, `getCargaHoraria()` e `imprimir(int nivel)`. Faça `Disciplina` e `Modulo` a implementarem, com a coleção de `Modulo` passando a ser de `ItemCurricular`. A classe `GradeCurricular` deixa de existir: as operações passam a ser dos próprios itens.
5. **Provar que funciona.** Acrescente um submódulo de **terceiro nível** (uma trilha de especialização dentro de um semestre) e verifique que nada no cliente precisou mudar.

## Critério de sucesso

Ao final, verifique que: (a) o texto do cabeçalho existe em **um único lugar** do projeto; (b) três características opcionais são atendidas por **três** classes, e não por oito; (c) a palavra `instanceof` **não aparece** em nenhum arquivo; (d) a coleção de `Modulo` é de `ItemCurricular`, e não de `Object` nem de `Disciplina`; e (e) a carga horária total continua sendo **340h** antes de você acrescentar o terceiro nível.

> O item (d) é o que decide se o Composite ficou de pé. Se a coleção fosse de `Disciplina`, um módulo não poderia conter outro módulo, e a estrutura ficaria limitada a dois níveis — a etapa 5 não passaria.

## Uma decisão que é sua

Os métodos `adicionar` e `remover` fazem sentido no composto, mas não na folha. Há duas saídas: deixá-los **só em `Modulo`** (preserva a segurança de tipos, mas o cliente precisa saber que tem um composto) ou colocá-los **na interface** (preserva a uniformidade, mas a folha precisa implementá-los lançando exceção, o que tensiona o princípio de Liskov).

A apostila adota a primeira. Você pode adotar a outra — mas **justifique a escolha no README**. O que não vale é copiar uma das duas formas sem perceber que havia uma decisão a tomar.
