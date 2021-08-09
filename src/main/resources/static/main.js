//GET
fetch(`http://localhost:8080/readAll`) 
    .then((response) => {
        if (response.status !== 200) {  
            console.error(`status: ${reponse.status}`);
            return;
        }
        response.json()
        .then(data => {
            console.info("Data is coming here",data)
            for( i in data){
                console.log(data[i])
                document.write(data[i].flavour)
            }

        }) 
    }).catch((err)=> console.error(`${err}`)); 


//POST
    fetch(`http://localhost:8080/readAll`, {
         method: 'post',
         headers: {
             "Content-type": "application/json"
         },
         body: JSON.stringify({
            firstName: "Naz",
            lastName: "Dar",
            contactNumber: "07999 999999"

           })
         })
         .then(res => res.json())
         .then(data => console.log(`Request succeeded with JSON response ${data}`))
         .catch(error => console.error(`Request failed ${error}`));
