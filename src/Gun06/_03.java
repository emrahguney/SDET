package Gun06;

import Utility.BaseDriver;

public class _03 extends BaseDriver {
    //[id^='u_'] -> id si    u_ ile başlayan->  startWith
    //[id*='u_'] -> id sinde u_ geçen      ->   contains
    //[id$='u_'] -> id si    u_ ile biten     endWith

    //input[id^='u_'] -> id si    u_ ile başlayan->  startWith
    //input[id*='u_'] -> id sinde u_ geçen      ->   contains
    //input[id$='u_'] -> id si    u_ ile biten   ->  endWith

/*<div>  cocukları: span, span, div
       tumcocukları: span, span, div, img, input

  <span> merhaba 1 </span>
  <span> merhaba 2 </span>

  <div>  -> çocuk
     <img src=logo.png>
     <input type="text">
  </div>

</div>
<label>merhaba</label> -kardeşi
<h2>merhaba</h2>       -diğer kardeş
kardeş -> bitişik kardeş
kardeşler -> tüm kardeşleri,altsoyu*/

    /*div[id='user-message'] > label
id si user-message olan DIV in çocuklarından label olan

div[id='user-message'] > label + span
id si user-message olan DIV in çocuklarından label dan hemen sonraki
span

div[id='user-message'] > span   yukarıdaki ile aynı

[id='get-input'] input
id si get-input olan elemanın bütün cocuklarındaki ilk input olan

>     -> cocuklarda arar
space -> tüm cocuklarda(torunlar dahil) arar
+     -> bitişik kardeş i bulur
~     -> tüm kardeşlerde ara

[id='user-message'] > *   cocukların hepsi(torunlar yok)
*/

    /*[class='nav navbar-nav'] > li+li+li
[class='nav navbar-nav'] > :nth-child(3)

yukarıdakilerin ikiside 3.Çocuk demekdir.*/
}
