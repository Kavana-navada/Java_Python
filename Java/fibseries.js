function fibseries()
{
    const n=parseInt(document.getElementById('num').value);
    const r=fiboseries(n);
   document.getElementById('result').textContent=`recursive fibonacci of ${n} no is: ${r}`;
}
function fiboseries( n)
{
    let f1=0,f2=1,f3,count;
    let result='';
    if(n==0||n==1)
    {
        result=f1;
        
    }

    else
    {
        result=f1+" "+f2+" ";
        count=2;
        while(count<n){
            f3=f1+f2;
            result+=f3+" ";
            f1=f2;
            f2=f3;
            count++;

        }

    }
    return result;
}