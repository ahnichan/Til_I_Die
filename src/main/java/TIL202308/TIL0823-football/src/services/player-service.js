const getConnection = require('../database/connection');
const PlayerRepository = require('../repositories/fbplayer-repo');

exports.findAllPlayers =   () => {

    return new Promise((resolve, reject) => {
    
    console.log('findAllPlayers service function called');
    const connection = getConnection();

    const results =  PlayerRepository.findAllPlayers(connection);
    

    connection.end();

    resolve(results);})
    
} 

exports.findPlayerByPlayerCode = (playerCode) => {
    return new Promise((resolve, reject) => {
    
    console.log('findPlayerByPlayerCode service function called');
    const connection = getConnection();
    
    const results =  PlayerRepository.findPlayerByPlayerCode(connection, playerCode);

    connection.end();

    resolve(results);
});
}