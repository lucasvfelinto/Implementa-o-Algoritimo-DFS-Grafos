[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/OtQWe80E)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11920144&assignment_repo_type=AssignmentRepo)
# Atividade de Apresentação
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="250"/>

## Identificação
**Disciplina**: Grafos
\
**Atividade**: (Pesquisa em Largura) Implementação do Algoritmo Depth First Search (DFS)

## Instruções
- Sua implementação deve estar dentro da pasta src/**main**/java 
- Não modifique nenhum código dentro da pasta src/**test**/java
- *Commits* fora do prazo **serão completamente desconsiderados**

##  Descrição
Dado um grafo ``LinkedList< LinkedList<Integer> > grafo`` implemente o algoritmo DFS da seguinte forma:
```java
  public class Solucao {
    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;
    
    public int[] ante;
    public int[] i;
    public int[] f;
    public int[] cor;
    public int tempo;

    private LinkedList< LinkedList<Integer> > grafo;

    public Solucao(LinkedList< LinkedList<Integer> > grafo)
 
    public void dfs_start(int s)
    public void dfs_visit(int u)
  } 
```