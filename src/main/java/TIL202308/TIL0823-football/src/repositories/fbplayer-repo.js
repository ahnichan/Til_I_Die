const fbplayerQuery = require('../database/fbplayer-query');

exports.findAllPlayers = (connection) => {
    


    return new Promise((resolve, reject) => {

        

    connection.query(fbplayerQuery.findAllPlayers(), (err, result) => {
        if(err){
            return reject(err);
        }
        
        resolve(result);
    });
});
};

exports.findPlayerByPlayerCode = (connection, playerCode) => {
    return new Promise((resolve, reject) => {

        connection.query(fbplayerQuery.findPlayerByPlayerCode(playerCode), [playerCode], (err, result) => {

        if(err){
            return reject(err);
        }

        resolve(result);

    });
});
};