let a=document.getElementById("title");
function f(){
    a.textContent="Welcome to AITS";
    a.innerHTML=`<h1 style="color:Red;"> Welcome to AITS</h1>`;
}

let fact= (n)=>{
    let res=1;
    for(let i=1;i<=n;i++){
        res*=i;
    }
    return res;
}
// console.log(fact(5));


function getFact(){
    let inputElement=document.getElementById("input").value; 
    console.log(fact(inputElement));
}

