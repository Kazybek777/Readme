SELECT distinct city
from station
where left(city, 1) in ('i','e', 'a', 'e', 'i', 'o', 'u')
  and right(city, 1) in ('i','e', 'a', 'e', 'i', 'o', 'u');