function validTime(time) {
    return parseInt(time[0]+time[1]) < 24 && parseInt(time[3]+time[4]) < 60;
}