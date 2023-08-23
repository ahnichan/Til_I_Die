const PlayerService = require('../services/player-service');

exports.findAllPlayers = async (req, res) => {
    const results = await PlayerService.findAllPlayers();

    console.log(results);
};

exports.findPlayerByPlayerCode = async (playerCode) => {
    const results = await PlayerService.findPlayerByPlayerCode(playerCode);

    console.log(results);
};
