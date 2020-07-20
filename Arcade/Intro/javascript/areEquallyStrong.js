function areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) {
    let yl = yourLeft, yr = yourRight, fl = friendsLeft, fr = friendsRight;
    return (yl == fl && yr == fr || yr == fl && yl == fr);
}