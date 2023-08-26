const mysql = require('mysql');
const connectionInfo = require('../config/db-config');

const getConnection = () => {

    console.log('connectionInfo :' , connectionInfo);
    return mysql.createConnection(connectionInfo);
}

module.exports = getConnection;