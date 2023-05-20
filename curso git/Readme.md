# Curso Git

## Aula 1 - Repositórios do git

* git clone `<link>` - Para clonar repositório
* git init - Iniciar repositório git

## Aula 2 - Gravando mudanças nos repositórios

### Estados de um arquivo no git
| Untracked | Unmodified | Modified | Staged |
| ---- | ---- | ---- | ---- |
| Quando o arquivo é removido | Após o commit, é o estado "padrão do arquivo" | Quando o arquivo é modificado e salvo | Preparatório, pré commit |

* git status - Mostra o estado dos arquivos/repositório
* git add <file> - Adiciona o arquivo para o estado staged (O '.' serve como coringa, para adicionar todos os modifieds.)

## Aula 3 - Git diff e commit
* git diff (origin/<branch>) - Para ver as diferenças entre arquivos no estado modified (flags -s/--staged para ver no estado staged)
* git commit - Para criar um um "estado" do código (flag -m "para criar uma mensagem")

## Aula 4 - Git log e restore
* git log - Mostra o histórico de commits (flags --oneline --decorate)
* git restore - Para remover modificações no estado modified (flags -s/--staged para remover modificações no estado staged)

## Aula 5 - Repositórios remotos
* git push origin <branch> - Para enviar para a remote url
* git pull - Para trazer da remote url
* git fetch - Para verificar modificações antes do git pull

## Aula 6 - Branchs
* git branch nome - cria uma branch
* git checkout branch - muda de branch

## Aula 7
* git merge nome da branch a receber - Para mesclar branchs