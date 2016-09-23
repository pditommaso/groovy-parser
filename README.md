# groovy-parser
[![Build Status](https://travis-ci.org/danielsun1106/groovy-parser.svg?branch=master)](https://travis-ci.org/danielsun1106/groovy-parser)
[![Coverage Status](https://coveralls.io/repos/github/danielsun1106/groovy-parser/badge.svg)](https://coveralls.io/github/danielsun1106/groovy-parser)
[![Apache License 2](http://img.shields.io/badge/license-ASF2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

The brand new parser can parse Groovy source code and construct the related AST, which is almost identical to the one generated by the old parser(except the corrected node location, e.g. line, column of node).

Currently almost all features of Groovy are available, the parser is being testing. If you want to give it a try, make sure your machine have `JDK 8+` installed and follow the steps:

```
$ git clone https://github.com/danielsun1106/groovy-parser.git
$ cd groovy-parser
$ ./gradlew groovyConsole
```

Feel free to report any issue you found, and pull requests are always welcome.

