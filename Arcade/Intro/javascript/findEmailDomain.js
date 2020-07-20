function findEmailDomain(address) {
    let pieces = address.split("@");
    return pieces[pieces.length - 1];
}