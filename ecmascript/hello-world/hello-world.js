class HelloWorld {
  hello(name = 'World') {
    return `Hello, ${name ? name : 'World'}!`
  }
}

export default HelloWorld;