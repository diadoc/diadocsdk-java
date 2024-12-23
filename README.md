|              | Build Status
|--------------|--------------
| master       | ![Build status (master)](https://github.com/diadoc/diadocsdk-java/actions/workflows/actions.yml/badge.svg?branch=master)
| latest       | ![Build status (lastest)](https://github.com/diadoc/diadocsdk-java/actions/workflows/actions.yml/badge.svg)


# diadocsdk-java

diadocsdk-java является официальной Java-реализацией клиента, использующего [публичный API Диадока](http://api-docs.diadoc.ru/).
На данный момент поддерживаются только JRE/JDK, на который установлен [КриптоПро JCP](https://www.cryptopro.ru/products/csp/jcp). Без КриптоПро JCP Diadoc SDK for Java работать не будет!

Поддерживаемые версии JCP:

|JCP|Diadoc Java SDK
|---|---------------
|1.x|< 1.64
|2.x|> 2.0

## Как использовать?

Вы можете [скачать готовый jar-файл diadocsdk-java со страницы релизов](https://github.com/diadoc/diadocsdk-java/releases).

Его можно [установить в локальный репозиторий maven](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html) и начать использовать как зависимость:

    <dependencies>
      <dependency>
        <groupId>ru.kontur.diadoc</groupId>
        <artifactId>diadocsdk</artifactId>
        <version>1.36.2</version>
      </dependency>
    </dependencies>

## Сборка проекта с помощью maven

Для сборки проекта используется [maven](http://maven.apache.org/). Исполняемые файлы maven можно скачать [на официальном сайте](http://maven.apache.org/download.cgi) и установить [по инструкции](http://maven.apache.org/install.html). В качестве альтернативы, можно установить maven с помощью [Chocolatey](https://chocolatey.org/packages/maven). В итоге maven должен находиться в переменной среды PATH, чтобы его можно было вызвать из командной строки.

Стандартный способ сборки проекта с помощью maven (старт из корня репозитория):

```
mvn package
```

Можно поместить собранный пакет в локальный репозиторий командой:

```
mvn install
```

## Добавление функциональности

- [Сделайте Fork](https://guides.github.com/activities/forking/)
- Создайте ветку для новой фичи (git checkout -b my-new-feature)
- Сделайте Commit изменений (git commit -am 'Add some feature')
- Сделайте Push новой ветки (git push origin my-new-feature)
- Создайте новый Pull Request
