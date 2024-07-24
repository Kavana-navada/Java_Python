function calcfact()
{
    const n=document.getElementById('num').value;
    const r=recfact(n);
    document.getElementById('result').textContent=`recurscive fact of ${n} is ${r}`;

}
function recfact(n)
{
    if(n<0)
        return "invalid"
    else if (n==1||n==0)
        return n;
    else
        return n*recfact(n-1);
}