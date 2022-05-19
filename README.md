WordCount
---

> HolanSwide
> holanswide@yeah.net

# 功能

对于一个本地的文件，统计文件中的字符数量或单词个数

# 使用

使用 java 运行本程序：

```cmd
> Input (filename param[-C/-W]), (quit 0) to quit: 
```

**用户输入**： 文件地址 参数

- **文件地址**
  本地文件的路径，例如：`E:\Apps\files\CIV_LogFile.txt `
- **参数**
  - `-C` 统计字符数
  - `-W` 统计单词数
- **退出程序**
  输入：`quit 0`

# 案例

```cmd
> Input (filename param[-C/-W]), (quit 0) to quit: test.txt -C

> Working.......
--------------------------------------------
> 1 LINE: testtesttesttest
> 2 LINE: 1234567890
============================================
> 统计结果： 28

> Done.......
-----------------------------------------------

> Input (filename param[-C/-W]), (quit 0) to quit: 
1
1
java.io.FileNotFoundException: 1 (系统找不到指定的文件。)
> Input (filename param[-C/-W]), (quit 0) to quit: E:\Apps\files\CIV_LogFile.txt -C

> Working.......
--------------------------------------------
> 1 LINE: PF_Cmd_GLOBAL_SETUP
> 2 LINE: in_data.appl_id = PrMr
> 3 LINE: PiPL version = 0x00203e00
> 4 LINE: PiPL out_flags = 0x02008021
> 5 LINE: PiPL out_flags2 = 0x00101409
> 6 LINE: PPro version = d0001
> 7 LINE: ColoristaRender  RenderThread start
> 8 LINE:   0x000000005D9420B0GpuContext::CreateContext   hostName = magicbullet_colorista_iv_0001
> 9 LINE: GpuContext  GL_VENDOR: NVIDIA Corporation
> 10 LINE: GpuContext  Vendor = NV
> 11 LINE: GpuContext  GL_RENDERER: GeForce GTX 1650/PCIe/SSE2
> 12 LINE: GpuContext  GL_SHADING_LANGUAGE_VERSION: 1.20 NVIDIA via Cg compiler
> 13 LINE: ColoristaRender   GpuContext::CreateContext: 0
> 14 LINE: ColoristaRender   threadInitResult: 0
> 15 LINE: PF_Cmd_PARAMS_SETUP 
> 16 LINE: PF_Cmd_GLOBAL_SETDOWN
> 17 LINE: ColoristaRender::Exit
> 18 LINE: ColoristaRender  RenderThread cleanup
> 19 LINE: ColoristaRender   RenderThread end
============================================
> 统计结果： 682

> Done.......
-----------------------------------------------

> Input (filename param[-C/-W]), (quit 0) to quit: quit 0
> Bye.
```