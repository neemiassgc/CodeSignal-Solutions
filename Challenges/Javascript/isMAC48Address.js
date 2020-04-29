function isMAC48Address(s) {
    let re = /[0-9A-F]{2}(-[0-9A-F]{2}){5}/i.exec(s);
    return re ? re[0] === s : false;
}