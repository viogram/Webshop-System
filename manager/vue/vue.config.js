const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
    lintOnSave: false,
  devServer: {
      host: '0.0.0.0',
      //https: true,
      port: 8080,
      client: {
          webSocketURL: 'ws://0.0.0.0:8080/ws',
      },
      headers: {
          'Access-Control-Allow-Origin': '*',
      }
  },
  chainWebpack: config =>{
    config.plugin('html')
        .tap(args => {
          args[0].title = "管理系统";
          return args;
        })
  }
})
