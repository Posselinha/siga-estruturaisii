# Siga Estruturais II

## Como compilar e executar

Pré-requisito: JDK 17 ou superior (`java -version` para verificar).

```bash
# 1. Compilar (a saída vai para a pasta "bin")
javac -encoding UTF-8 -d bin src/siga/*.java

# 2. Executar
java -cp bin siga.Main
```

R - Foi notado a existência de 4 subclasses para 3 caracteristicas opcionais de relatorio, e caso fossem 3 opcionais independentes seriam 8 classes, e 16 classes caso fossem 4 opcionais.

R - Foi escolhido deixar `adicionar()` e `remover()` apenas em `Modulo`, porque disciplinas não possuem outros elementos. Assim, evitamos métodos desnecessários e mantemos o código mais simples.
