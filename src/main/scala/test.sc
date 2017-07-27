
def isPalindrome[A](ls:List[A]):Boolean = (ls==ls.reverse)

isPalindrome(List(1, 2, 3, 2, 11))

def flatten(ls:List[Any]):List[Any] = ls flatMap  {
case ms:List[_] => flatten(ms)
case e => List(e)

}
//flatten(List(List(1, 1), 2, List(3, List(5, 8))))

val ls=List[Any](List(1, 1), 2, List(3, List(5, 8)))
print(List(List(1, 1), List(5, 8)).flatten)


def compress[A](ls:List[A]): List[A]= {
  ls.foldRight(List[A]()) {
    (h, r) => if (r.isEmpty || r.head != h) h :: r else r
  }
}
compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))


for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)

def drop[A](n:Int, ls:List[A])={

  ls.zipWithIndex.filter(x=> (x._2+1) % n !=0 )

}
drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

def split[A](n: Int, ls: List[A]): (List[A],List[A])={
  (ls.take(n), ls.drop(n))
}
split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

List('a, 'b, 'c, 'd).splitAt(2)

val Attempts = 2500000
val KeySize  = 5000000

// populate
val dictionary = ((1 to Attempts) map (_ => randomKey(KeySize) -> randomValue())).toMap

// lookup
(1 to KeySize) foreach (_ => dictionary.get(randomKey(KeySize)))
















