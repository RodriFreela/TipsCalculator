# Tips Calculator
Aplicativo desenvolvido em Kotlin voltado para facilitar o cálculo de contas em restaurantes. O app permite que os usuários insiram o valor total da conta e o número de pessoas na mesa, dividindo o valor igualmente entre todos. 
Além disso, ele oferece a opção de calcular e adicionar uma porcentagem de gorjeta já pré-definida.

## Principais funcionalidades:
- Entrada do valor da conta: O usuário insere o valor total da refeição.
- Divisão da conta: A conta pode ser dividida pelo número de pessoas presentes, distribuindo o valor igualmente.
- Cálculo de gorjeta: O usuário pode selecionar a porcentagem de gorjeta que deseja adicionar ao total, podendo escolher entre já valores pré-definidos.
- Cálculo final: O app exibe o valor final que cada pessoa precisa pagar, incluindo a gorjeta ou não.
- De momento oferece suporte para idioma Inglês, Espanhol e Português.

## Proposta de desenvolvimento:
Uma das principais escolhas técnicas foi o uso do ViewBinding para recuperar e manipular as views, em vez do tradicional findViewById(). 
Isso não só tornou o código mais limpo e conciso, como também aumentou a segurança, minimizando o risco de erros e melhorando a legibilidade do código. 
Com ViewBinding, se garante que os IDs das views sejam gerados automaticamente, o que previne problemas comuns de vinculação manual e facilita a manutenção do código.
A aplicação foi desenvolvida com foco na simplicidade e usabilidade, aproveitando os recursos nativos do Kotlin para garantir uma interface responsiva e eficiente em dispositivos Android.

## :camera_flash: Screenshots
<img src="https://github.com/user-attachments/assets/e10d8b9b-1416-4a3e-b2a9-cea3e235cb58" width=160/>
<img src="https://github.com/user-attachments/assets/4dc83ab0-8b24-4bb2-b236-637ab9420da8" width=160/>
<img src="https://github.com/user-attachments/assets/1b7b833a-4e3e-4071-99d7-c3f4d5cfb7d2" width=160/>
<img src="https://github.com/user-attachments/assets/dbf8830b-5631-4f27-b28f-99e64572e80c" width=160/>
<img src="https://github.com/user-attachments/assets/e09522c3-b62d-4208-9367-99c4c72ee970" width=160/>
<img src="https://github.com/user-attachments/assets/28b07ecb-88ff-4dc0-b191-c36141230975" width=160/>
<img src="https://github.com/user-attachments/assets/d56c2223-8571-4e9f-a8ec-37b259869508" width=160/>

## Tecnologias
- Activity
- Intent
- SnackBar
- ViewGroups
- ConstraintLayout
- View
  - TextView
  - EditText
  - Button
- RadioGroup
  - RadioButton
