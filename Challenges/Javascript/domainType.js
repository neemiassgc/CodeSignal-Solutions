function domainType(domains) {
    let map = {
        com: "commercial",
        org: "organization",
        net: "network",
        info: "information"
    };
    
    return domains
    .map(e => map[/[a-z]{3,4}$/g.exec(e)])
}