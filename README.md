# CI CD Android
#### Exemplo de uma implementação de CI/CD para desenvolvedores Android  

![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)

Primeiro passo é configurar assinatura do seu aplicativo no gradle
[Considerações sobre assinaturas](https://developer.android.com/studio/publish/app-signing#considerations)
> Observação: o nome dentro do bloco `signingConfigs` pode ser de sua escolha, não precisa colocar o mesmo da documentação, ele será referênciado dentro do bloco `android.buildTypes.release` populando a propriedade `signingConfig`.

> Exemplo 
`signingConfig signingConfigs.configSigningProduction`


## Gerando um APK via terminal

Depois que você tiver um jks criado, e gradle configurado você pode está gerando um aplicativo via terminal executando o comando abaixo

```sh
./gradlew assembleRelease --stacktrace
```
 Nesse exemplo o **--stacktrace** foi passado porque caso ocorra algum problema ao executar o comando, será printando um log do problema no terminal. 

