exports.findAllPlayers = () => {

    return `
        SELECT *
            FROM TBL_PLAYER
    `;

};

exports.findPlayerByPlayerCode = () => {

    return `
        SELECT *
            FROM TBL_PLAYER
            WHERE PLAYER_CODE = ?
    `;

};