function isMAC48Address(inputString) {
    let match = /[0-9A-F]{2}(-[0-9A-F]{2}){5}/.exec(inputString)
    return match != null ? match[0] === inputString : false
}