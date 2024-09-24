const path = require('path')
const CopyPlugin = require('copy-webpack-plugin')
module.exports = {
    mode:'production',
    entry: './src/modelo/services/cadastroCandidato',
    devServer:{
        static: {
            directory: './dist/cs', // Ajuste o caminho conforme necessário
        },
        port:8080,
        hot: true
    },
    output:{
        filename: 'app.min.js',
        path: path.join(__dirname, 'dist')
    },
    plugins:[
      new CopyPlugin({
          patterns:[{from: "src/public"}]
      })
    ],
    resolve: {
        extensions: ['.ts', '.js']
    },
    module:{
        rules:[{
            test: /\.ts?$/,
            use: 'ts-loader',
            exclude: /node_modules/
        }]
    }
}